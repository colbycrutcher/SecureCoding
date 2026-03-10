import pytest
from cybr437regex import cybr437regex

#===========================================================
def test_ssn_pattern_valid_format():
    assert cybr437regex.ssn_pattern("132-45-6789") == True
    assert cybr437regex.ssn_pattern("132456789") == True
    assert cybr437regex.ssn_pattern("13345-6789") == True
    assert cybr437regex.ssn_pattern("133456789") == True
    assert cybr437regex.ssn_pattern("135 45-6789") == True

def test_ssn_pattern_invalid_format():
    assert cybr437regex.ssn_pattern("123-45-6789") == False
    assert cybr437regex.ssn_pattern("123--45-6789") == False
    assert cybr437regex.ssn_pattern("000-26-6781") == False
    assert cybr437regex.ssn_pattern("123.45.6789") == False
    assert cybr437regex.ssn_pattern("123-45-678") == False

#===========================================================
def test_email_pattern_valid_format():
    assert cybr437regex.email_pattern("john.smith@ewu.edu ") == True
    assert cybr437regex.email_pattern("ccrutcher@ewu.edu ") == True
    assert cybr437regex.email_pattern("secure.code@ewu.edu ") == True
    assert cybr437regex.email_pattern("ewucs.dept@ewu.edu") == True
    assert cybr437regex.email_pattern("colby@gmail.com ") == True
    assert cybr437regex.email_pattern("jimmysmi.th@ewu.edu ") == True

def test_email_pattern_invalid_format():
    assert cybr437regex.email_pattern("mr..john.smith@ewu.edu") == False
    assert cybr437regex.email_pattern("johnsmith.@ewu.edu") == False
    assert cybr437regex.email_pattern(".colbyc@ewu.edu") == False
    assert cybr437regex.email_pattern("john.smith@e") == False
    assert cybr437regex.email_pattern("colbycrutcher..@e") == False

#===========================================================
def test_date_pattern_valid_format():
    assert cybr437regex.date_pattern("07/11/2001") == True
    assert cybr437regex.date_pattern("07-11-2001") == True
    assert cybr437regex.date_pattern("7/11/2001") == True
    assert cybr437regex.date_pattern("7-11-2001") == True
    assert cybr437regex.date_pattern("12-25-2026") == True

def test_date_pattern_invalid_format():
    assert cybr437regex.date_pattern("3/32/2023") == False
    assert cybr437regex.date_pattern("03/32/2023") == False
    assert cybr437regex.date_pattern("3-32/023") == False
    assert cybr437regex.date_pattern("3/32-2023") == False
    assert cybr437regex.date_pattern("3322023") == False

#===========================================================
def test_password_pattern_valid_format():
    assert cybr437regex.password_pattern("p@ssW0rd123!") == True
    assert cybr437regex.password_pattern("#SecuR1ty9$") == True
    assert cybr437regex.password_pattern("aB3!eFgH4*") == True
    assert cybr437regex.password_pattern("!CompLex987?") == True
    assert cybr437regex.password_pattern("?C0lby1sc0ol!") == True


def test_password_pattern_invalid_format():
    assert cybr437regex.password_pattern("Pa$sword1212") == False
    assert cybr437regex.password_pattern("Password121!") == False
    assert cybr437regex.password_pattern("!P@SSW0RD123") == False
    assert cybr437regex.password_pattern("!abcdE98765") == False
    assert cybr437regex.password_pattern("p@ssW0rd11!") == False

#===========================================================
def test_ion_pattern_valid_format():
    assert cybr437regex.ion_pattern("0rion") == True
    assert cybr437regex.ion_pattern("conversIon") == True
    assert cybr437regex.ion_pattern("Lion") == True
    assert cybr437regex.ion_pattern("VacatION") == True
    assert cybr437regex.ion_pattern("123Lesion") == True


def test_ion_pattern_invalid_format():
    assert cybr437regex.ion_pattern("fashion") == False
    assert cybr437regex.ion_pattern("station") == False
    assert cybr437regex.ion_pattern("radiation") == False
    assert cybr437regex.ion_pattern("1Lession") == False
    assert cybr437regex.ion_pattern("cscd") == False


if __name__ == '__main__':
    pytest.main(["-q", "--tb=no", __file__])
