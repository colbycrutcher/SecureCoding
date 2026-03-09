import pytest
from cybr437regex import cybr437regex

#===========================================================
def test_ssn_pattern_valid_format():
    assert cybr437regex.ssn_pattern("") == True

def test_ssn_pattern_invalid_format():
    assert cybr437regex.ssn_pattern("") == False

#===========================================================
def test_email_pattern_valid_format():
    assert cybr437regex.email_pattern("") == True

def test_email_pattern_invalid_format():
    assert cybr437regex.email_pattern("") == False

#===========================================================
def test_date_pattern_valid_format():
    assert cybr437regex.date_pattern("") == True

def test_date_pattern_invalid_format():
    assert cybr437regex.date_pattern("") == False

#===========================================================
def test_password_pattern_valid_format():
    assert cybr437regex.password_pattern("") == True

def test_password_pattern_invalid_format():
    assert cybr437regex.password_pattern("") == False

#===========================================================
def test_ion_pattern_valid_format():
    assert cybr437regex.ion_pattern("") == True

def test_ion_pattern_invalid_format():
    assert cybr437regex.ion_pattern("") == False

if __name__ == '__main__':
    pytest.main(["-q", "--tb=no", __file__])
