import pandas as pd
import numpy as np
import yfinance as yf
import talib
import time

# Define the stock symbol and timeframe
symbol = "AAPL"
timeframes = ["1h", "1d", "1mo"]

# Define the indicators
def get_indicators(df):
    # Simple Moving Averages
    df['SMA_14'] = talib.SMA(df['Close'], timeperiod=14)
    df['SMA_52'] = talib.SMA(df['Close'], timeperiod=52)
    
    # Bollinger Bands
    upper_band, middle_band, lower_band = talib.BBANDS(df['Close'], timeperiod=20)
    df['BB_UPPER'] = upper_band
    df['BB_MIDDLE'] = middle_band
    df['BB_LOWER'] = lower_band
    
    # Relative Strength Index
    df['RSI'] = talib.RSI(df['Close'], timeperiod=14)
    
    # Moving Average Convergence Divergence
    macd, macdsignal, macdhist = talib.MACD(df['Close'], fastperiod=12, slowperiod=26, signalperiod=9)
    df['MACD'] = macd
    df['MACD_SIGNAL'] = macdsignal
    df['MACD_HIST'] = macdhist
    
    return df

# Define the function to generate the forecast
def generate_forecast(df, tf):
    # Calculate the indicators
    df = get_indicators(df)
    
    # Get the latest close price
    close_price = df['Close'].iloc[-1]
    
    # Calculate the resistance and support levels
    resistance = df['BB_UPPER'].iloc[-1]
    support = df['BB_LOWER'].iloc[-1]
    
    # Calculate the target price
    target_price = close_price + (resistance - support)
    
    # Calculate the stop loss price
    stop_loss_price = support
    
    # Return the forecast
    return {
        "symbol": symbol,
        "tf": tf,
        "close_price": close_price,
        "target_price": target_price,
        "stop_loss_price": stop_loss_price
    }

# Define the function to continuously generate new forecasts every minute
def run_forecasts():
    while True:
        # Download historical data for all timeframes
        hist_data = {}
        for tf in timeframes:
            data = yf.download(symbol, interval=tf, period="730d")
            hist_data[tf] = data

        # Generate the forecast for each timeframe
        forecasts = []
        for tf in timeframes:
            data = hist_data[tf]
            forecast = generate_forecast(data, tf)
            forecasts.append(forecast)

        # Print the forecasts
        for forecast in forecasts:
            print("Timeframe:", forecast["tf"])
            print("Symbol:", forecast["symbol"])
            print("Close Price:", forecast["close_price"])
            print("Target Price:", forecast["target_price"])
            print("Stop Loss Price:", forecast["stop_loss_price"])
            print("="*50)

        # Pause for a minute before generating new forecasts
        time.sleep(60)

# Run the function to continuously generate new forecasts
run_forecasts()
