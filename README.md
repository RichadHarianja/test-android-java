# QA Automation - Native App 

* This is a Cucumber - Appium Framework
* Currently only designed to test Android devices

## Getting Started

```
git clone https://github.com/telangn/appium-cucumber.git
```

### Prerequisites

* Maven Installed
* Android Studio configured to launch an emulator
* A native app SDK to test with
* Configure Android Path on your environment variables
    
    ANDROID_HOME: root android sdk directory
    
    PATH: ANDROID_HOME + the following paths = platform-tools, tools, tools/bin

* [Appium](https://www.npmjs.com/package/appium)
```
npm i appium
```

### Installing

There is no need to start the appium server manually, as the program will do so upon execution.

From the directory of the POM.xml :

```
mvn clean install
```
Or..

```
mvn verify
```

You can use the [uiautomatorviewer](https://developer.android.com/training/testing/ui-testing/uiautomator-testing) to inspect elements on Android devices, or you can use [Appium Desktop](https://github.com/appium/appium-desktop)

## Deployment

This project is ready to deploy on Jenkins. 

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Cucumber](https://cucumber.io/) - Framework
* [Selenium](https://www.seleniumhq.org/) - WebDriver
* [Appium](http://appium.io/) -  Native App automation framework

## Contributing

N/A

## Versioning

N/A

## Authors

* **Ninad Telang** - *Initial work* - [Ninad](https://github.com/telangn)


## License

N/A

## Acknowledgments

* God and our Lord Jesus Christ
