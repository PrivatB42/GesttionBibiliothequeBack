version: '3.1'

services:

  db:
    platform: linux/x86_64
    image: mysql:5.7
    restart: always
    ports:
      # <Port exposed> : < MySQL Port running inside container>
      - '3306:3306'

    environment:
      MYSQL_DATABASE: 'db'
      # So you don't have to use root, but you can if you like
      MYSQL_USER: 'root'
      # You can use whatever password you like
      MYSQL_PASSWORD: ''
      # Password for root access
      MYSQL_ROOT_PASSWORD: ''