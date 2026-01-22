#!/bin/bash
set -e

sudo apt update
sudo apt upgrade -y

wget https://github.com/pwndbg/pwndbg/releases/download/2024.08.29/pwndbg_2024.08.29_amd64.deb
sudo dpkg -i pwndbg_2024.08.29_amd64.deb

rm pwndbg_2024.08.29_amd64.deb

