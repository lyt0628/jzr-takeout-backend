pipeline {
    agent any

    environment {
        // 定义环境变量
        MAVEN_HOME = tool 'Maven' // 确保在 Jenkins 中配置了 Maven 工具
    }

    stages {
        stage('Checkout') {
            steps {
                // 从版本控制系统检出代码
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    // 使用 Maven 构建项目
                    sh "${MAVEN_HOME}/bin/mvn clean install"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // 运行测试
                    sh "${MAVEN_HOME}/bin/mvn test"
                }
            }
        }

        stage('Run Application') {
            steps {
                script {
                    // 启动 Spring Boot 应用
                    sh "nohup java -jar target/your-spring-boot-app.jar > app.log 2>&1 &"
                }
            }
        }
    }

    post {
        always {
            // 清理工作区
            cleanWs()
        }
        success {
            echo 'The pipeline has completed successfully!'
        }
        failure {
            echo 'The pipeline has failed!'
        }
    }
}