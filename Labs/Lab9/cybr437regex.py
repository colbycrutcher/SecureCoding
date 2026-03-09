import re

class cybr437regex:
    
    
    @staticmethod
    def ssn_pattern(ssn_string : str) -> bool:
        if not isinstance(ssn_string, str) or not ssn_string.strip():
            raise ValueError("Bad ssn_string Parameter")
        
        regex = r"^(?!([0-9])(?:[ \-]?\1){8})(?!1[ \-]?2[ \-]?3[ \-]?4[ \-]?5[ \-]?6[ \-]?7[ \-]?8[ \-]?9)(?!9\d{2}[ \-]?[^9])(?:[189]\d{2})[ \-]?(?!00)\d{2}[ \-]?(?!0000)\d{4}$"
        
        return re.fullmatch(regex, ssn_string) is not None


    @staticmethod
    def email_pattern(email_string : str) -> bool:
        if not isinstance(email_string, str) or not email_string.strip():
            raise ValueError("Bad email_string Parameter")
            
        regex = r"^(?!.*\.\.)[^@\.]+(?:\.[^@\.]+)?@[^@]{3,}$"
        
        return re.fullmatch(regex, email_string) is not None
    

    @staticmethod
    def date_pattern(date_string : str) -> bool:
        if not isinstance(date_string, str) or not date_string.strip():
            raise ValueError("Bad date_string Parameter")
            
        regex = r"^(?=.*?([-/]))(?:(?:0?[13578]|1[02])\1(?:0?[1-9]|[12]\d|3[01])|(?:0?[469]|11)\1(?:0?[1-9]|[12]\d|30)|0?2\1(?:0?[1-9]|1\d|2[0-9]))\1\d{4}$"
        
        return re.fullmatch(regex, date_string) is not None
        

    
    @staticmethod
    def password_pattern(password_string : str) -> bool:
        if not isinstance(password_string, str) or not password_string.strip():
            raise ValueError("Bad password_string Parameter")
        
        regex = r"^(?!.*[a-z]{4})(?!.*(\d)\1)(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[^a-zA-Z0-9\s])(?:[a-z]|[^a-zA-Z0-9\s]).{9,}$"
        
        return re.fullmatch(regex, password_string) is not None
        
        
    @staticmethod
    def ion_pattern(ion_string : str) -> bool:
        if not isinstance(ion_string, str) or not ion_string.strip():
            raise ValueError("Bad ion_string Parameter")
        
        regex = r"^(?i)(?:[A-Za-z]{2})*[A-Za-z]ion$"
        
        return re.fullmatch(regex, ion_string) is not None
        
    