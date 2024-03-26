# Workshop JavaFX JDBC
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/FelipeMT21/workshop-springboot2-mongodb/blob/main/LICENSE) 

# Sobre o projeto

O projeto é uma aplicação JavaFX que visa demonstrar o desenvolvimento de uma interface gráfica de usuário (GUI) para gerenciamento de departamentos e funcionários em uma empresa fictícia. Utiliza-se o padrão MVC (Model-View-Controller) para separar as responsabilidades de apresentação, lógica de negócios e dados.

A aplicação permite realizar operações básicas, como adicionar, editar e excluir departamentos e funcionários, além de visualizar uma lista de todos os departamentos e funcionários cadastrados. Também implementa validações para garantir a integridade dos dados inseridos pelo usuário.

O código fonte segue boas práticas de programação, incluindo a modularização do código em classes e métodos bem definidos, o uso de exceções para tratamento de erros e a organização da estrutura de arquivos seguindo convenções de nomenclatura.

## Modelo conceitual
![Modelo Conceitual](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Inicial.png)

![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Seller.png)

![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20New%20Seller.png)

![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Department.png)

![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20New%20Department.png)


# Tecnologias utilizadas
## Back end
- Java
- JavaFX
- JDBC
- FXML
- Padrão MVC
- DAO - Data Access Object
- API REST
## Implantação em produção
- Banco de dados: MySQL

# Como executar o projeto

## Back end
Pré-requisitos: Versão usada openjdk version "17.0.9" 2023-10-17 LTS

```bash
# Programas usados: IDE Eclipse e Scene Builder

Baixe o executável e as configurações usadas!
```
https://drive.google.com/drive/folders/1RTOdkop87JAFiKb1BCkjvZ6sO4i87NA4?usp=sharing
```

A pasta 'dist' contém as bibliotecas, a versão utilizada do JDK, OpenSDK, JavaFX e o arquivo 'db.properties'. Esses são arquivos essenciais que sua máquina precisa para executar o aplicativo. Caso já os tenha instalado, não é necessário seguir os passos de instalação abaixo.

Para construir o arquivo JAR, siga o checklist abaixo:

Clique com o botão direito no nome do projeto -> Exportar -> Java/Runnable JAR file -> Próximo
Selecione a classe principal
Escolha a pasta de destino
Manipulação de bibliotecas: 3ª opção
Empacote os seguintes arquivos junto ao arquivo JAR:

Arquivo JAR
db.properties
Conector MySQL
JavaFX SDK
Java JDK"
```
Passo 1: Pasta 'dist'
![](https://github.com/FelipeMT21/assets-workshop-javafx-jdbc/blob/main/Instala%C3%A7%C3%A3o%2001.png)

```
Instalação
Checklist:
- Instalar o Java: [Link para download](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
  - Configurar JAVA_HOME (por exemplo: C:\Program Files\Java\jdk-17.0.3)
- Copiar JavaFX
  - Configurar PATH_TO_FX (por exemplo: C:\java-libs\javafx-sdk\lib)
  - Colocar o MySQL Connector na pasta lib
- Copiar o arquivo JAR & db.properties
  - Executar o aplicativo:
    java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp workshop-javafx-jdbc.jar application.Main```"
```
# Passo 2:
Copie a pasta 'zulu17.46.19-ca-jdk17.0.9-win_x64' para o diretório 'C:\Program Files\Java'.
OBS: Se a pasta 'Java' não existir, crie-a!
![](https://github.com/FelipeMT21/assets-workshop-javafx-jdbc/blob/main/Instala%C3%A7%C3%A3o%2002.png)

# Passo 3:
Vá em 'Propriedades do Sistema' -> 'Variáveis de Ambiente', crie uma variável chamada JAVA_HOME e atribua o valor 'C:\Program Files\Java\zulu17.46.19-ca-jdk17.0.9-win_x64', em seguida, clique em 'OK
![](https://github.com/FelipeMT21/assets-workshop-javafx-jdbc/blob/main/Instala%C3%A7%C3%A3o%2003.png)

# Passo 4:
Verifique a variável 'Path', clique em 'Editar' e certifique-se de que contenha '%JAVA_HOME%\bin' e 'C:\Program Files\Java\zulu17.46.19-ca-jdk17.0.9-win_x64\bin' acima de todas as outras entradas!
![](https://github.com/FelipeMT21/assets-workshop-javafx-jdbc/blob/main/Instala%C3%A7%C3%A3o%2004.png)

# Passo 5:
Crie uma pasta chamada 'java-libs' no diretório raiz do seu disco local C:. Em seguida, extraia do arquivo zip 'openjfx-17_windows-x64_bin-sdk' uma pasta chamada 'javafx-sdk-17' e cole-a em 'C:\java-libs'. Renomeie a pasta para 'javafx-sdk'.
![](https://github.com/FelipeMT21/assets-workshop-javafx-jdbc/blob/main/Instala%C3%A7%C3%A3o%2005.png)

# Passo 6:
Novamente em 'Propriedades do Sistema' -> 'Variáveis de Ambiente', crie uma variável chamada PATH_TO_FX e atribua o valor 'C:\java-libs\javafx-sdk\lib', em seguida, clique em 'OK'.
![](https://github.com/FelipeMT21/assets-workshop-javafx-jdbc/blob/main/Instala%C3%A7%C3%A3o%2006.png)

# Passo 7:
Vá até a pasta 'dist\workshop-javafx-jdbc_lib', copie o arquivo 'mysql-connector-j-8.2.0.jar' e cole-o na pasta 'C:\java-libs\javafx-sdk\lib'.
![](https://github.com/FelipeMT21/assets-workshop-javafx-jdbc/blob/main/Instala%C3%A7%C3%A3o%2007.png)

# Passo 8:
Inicie seu MySQL e faça a configuração no arquivo 'db.properties'.
![](https://github.com/FelipeMT21/assets-workshop-javafx-jdbc/blob/main/Instala%C3%A7%C3%A3o%2008.png)
```

# Executar o projeto
A pasta 'MyApp' é onde você encontrará o executável e o arquivo 'db.properties'. Configure-o de acordo com seu banco de dados local. Após isso, basta dar dois cliques no 'myapp.bat'.
```

# Passo 9:
Para executar, abra um prompt de comando na pasta do 'MyApp' e cole o código abaixo:
```
java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp workshop-javafx-jdbc.jar application.Main
```
Ou simplesmente clique no 'myapp.bat' que ele executará automaticamente.
  ![](https://github.com/FelipeMT21/assets-workshop-javafx-jdbc/blob/main/Instala%C3%A7%C3%A3o%2009.png)

# Autor

João Felipe Martins da Silva

Linkedin - https://www.linkedin.com/in/jo%C3%A3o-felipe-1028aa210/

Site/Portfólio - https://felipe-developer.vercel.app/
