# Android Application - EMI Calculator 

## Overview

The Android EMI Calculator application is designed to help users calculate Equated Monthly Installments (EMIs) for loans based on the reducing balance method. Users can enter the principal amount, interest rate, and loan tenure to get the EMI amount and the total interest payable. The app also allows users to select products like mobiles, laptops, and cars, enter down payment, select the bank with corresponding interest rates, and calculate the EMI for user-entered values.

## Features

- **EMI Calculation**: Calculate EMIs using the reducing balance method.
- **Product Selection**: Choose from predefined products like mobiles, laptops, and cars.
- **Bank Selection**: Select banks with corresponding interest rates.
- **Down Payment**: Enter down payment for accurate EMI calculation.
- **User-Friendly Interface**: Simple and intuitive UI for ease of use.

## Technologies Used

- **Programming Language**: Java/Kotlin
- **Development Environment**: Android Studio
- **Database**: SQLite (if applicable)

## Installation

### Prerequisites

- Android Studio
- Android SDK
- Java Development Kit (JDK)

### Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Kruthikasv/Android-application---EMI-Calculator.git
   ```

2. **Open the Project in Android Studio**
   - Launch Android Studio.
   - Click on `Open an existing Android Studio project`.
   - Navigate to the cloned repository and open it.

3. **Build the Project**
   - Sync the project with Gradle files.
   - Build the project to resolve any dependencies.

4. **Run the Application**
   - Connect an Android device or use an emulator.
   - Click on `Run` to install and start the application on the selected device.

## Usage

### Calculating EMI

1. **Select Product**: Choose a product from the list (e.g., mobile, laptop, car).
2. **Enter Details**:
   - Principal Amount: Enter the loan amount.
   - Interest Rate: Enter the annual interest rate.
   - Tenure: Enter the loan tenure in months or years.
   - Down Payment: Enter the down payment amount (optional).
3. **Select Bank**: Choose a bank with the corresponding interest rate (if applicable).
4. **Calculate**: Click on the `Calculate` button to get the EMI amount and total interest payable.
5. **View Results**: The EMI and total interest payable will be displayed on the screen.

### Customization

- **Add Products**: Modify the code to include more products.
- **Update Interest Rates**: Change the predefined interest rates for banks in the source code.

## Code Structure

- **MainActivity.java/Kotlin**: Main activity handling the user interface and input.
- **Calculator.java/Kotlin**: Logic for calculating EMI based on the reducing balance method.
- **ProductSelectionFragment.java/Kotlin**: Fragment for product selection.
- **BankSelectionFragment.java/Kotlin**: Fragment for bank selection and interest rate display.
- **res/layout/**: XML files for UI layout.
- **res/values/**: XML files for string and style resources.

## Contributions

Contributions to the project are welcome. Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -am 'Add your feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contact

For any inquiries or support, please contact:

- **Name**: Kruthika Vasisht
- **Email**: kruthikasvasisht@gmail.com
