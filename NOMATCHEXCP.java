// Custom exception class for string mismatch errors
class NOMATCHEXCP extends Exception {
    private String inputString; // Variable to store the erroneous input string
    private int lineNumber; // Variable to store the line number where the exception occurred

    // Constructor to initialize the exception with the error message, erroneous string, and line number
    public NOMATCHEXCP(String message, String inputString, int lineNumber) {
        // Call the superclass constructor with the provided error message
        super(message);
        // Initialize the instance variables with the provided values
        this.inputString = inputString;
        this.lineNumber = lineNumber;
    }

    // Overridden toString() method to provide a custom string representation of the exception
    @Override
    public String toString() {
        // Return a string containing the exception type, line number, error message, and erroneous string
        return "NOMATCHEXCP at line " + lineNumber + ": " + getMessage() + " - Erroneous string: " + inputString;
    }
}