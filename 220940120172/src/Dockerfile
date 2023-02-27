FROM openjdk:8-jdk-alpine
COPY . /usr/src/SumCalculatorDocker
WORKDIR /usr/src/SumCalculatorDocker
RUN javac SumOfTwoNumbers.java
CMD ["java", "SumOfTwoNumbers"]