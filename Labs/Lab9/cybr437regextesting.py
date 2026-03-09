import pytest
from cybr437regex import cybr437regex

#===========================================================
def test_ssn_pattern_valid_format():
    assert cybr437regex.ssn_pattern("132-45-6789") == True

def test_ssn_pattern_invalid_format():
    assert cybr437regex.ssn_pattern("123-45-6789") == False

#===========================================================
def test_email_pattern_valid_format():
    assert cybr437regex.email_pattern("john.smith@ewu.edu ") == True

def test_email_pattern_invalid_format():
    assert cybr437regex.email_pattern("mr.john.smith@ewu.edu") == False

#===========================================================
def test_date_pattern_valid_format():
    assert cybr437regex.date_pattern("07/11/2001") == True

def test_date_pattern_invalid_format():
    assert cybr437regex.date_pattern("3/32/2023") == False

#===========================================================
def test_password_pattern_valid_format():
    assert cybr437regex.password_pattern("p@ssW0rd123!") == True

def test_password_pattern_invalid_format():
    assert cybr437regex.password_pattern("Pa$sword1212") == False

#===========================================================
def test_ion_pattern_valid_format():
    assert cybr437regex.ion_pattern("0rion") == True

def test_ion_pattern_invalid_format():
    assert cybr437regex.ion_pattern("colby") == False

if __name__ == '__main__':
    pytest.main(["-q", "--tb=no", __file__])
