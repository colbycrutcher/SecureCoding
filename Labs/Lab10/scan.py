import re

def analyze_c_file(filepath):
    # Dictionary mapping regex patterns to specific warning messages
    vulnerabilities = {
        r'\bgets\s*\(': "CRITICAL: Deprecated function 'gets()' found. Inherently vulnerable to buffer overflows.",
        r'\bstrcpy\s*\(': "WARNING: Unsafe function 'strcpy()' found. Does not check bounds.",
        r'\bsprintf\s*\(': "WARNING: Unsafe function 'sprintf()' found. Can cause buffer overflows.",
        r'\bvsprintf\s*\(': "WARNING: Unsafe function 'vsprintf()' found. Can cause buffer overflows.",
        r'\bitoa\s*\(': "WARNING: Non-standard function 'itoa()' found. Use snprintf() instead.",
        r'\bscanf\s*\(\s*\"%s\"': "CRITICAL: Unbounded 'scanf()' format string found. Allows buffer overflows."
    }

    print(f"--- Scanning '{filepath}' for vulnerabilities ---\n")

    try:
        with open(filepath, 'r') as file:
            # Read file line by line, tracking the line number
            for line_num, line in enumerate(file, 1):
                # Check the current line against all our regex patterns
                for pattern, message in vulnerabilities.items():
                    if re.search(pattern, line):
                        # Output the required format: Message, Line Number, Code
                        print(f"Issue: {message}")
                        print(f"Line Number: {line_num}")
                        print(f"Code snippet: {line.strip()}\n")
                        print("-" * 50)
                        
    except FileNotFoundError:
        print(f"Error: Could not find the file '{filepath}'.")

if __name__ == "__main__":
    # Run the analyzer on task2.c
    analyze_c_file('task2.c')