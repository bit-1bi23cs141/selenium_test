pipeline{
  agent any

  tools{
    maven 'Maven'
  }

  stages{
    stage('checkpoint'){
      steps{
        git branch:'master', url:'https://github.com/bit-1bi23cs141/selenium_test'
      }
    }

    stage('build'){
      steps{
        sh 'mvn build'
      }
    }

    stage('test'){
      steps{
        sh 'mvn test'
      }
    }

    stage('run application'){
      steps{
        sh 'mvn exec:java -Dexec.mainClass='com.example.App'
      }
    }
  }

  post{
    success{
      echo 'build and deplied succesfully'
    }
    failre{
      echo 'failure'
    }
  }
}
