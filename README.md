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
A pasta dist contém as libs, a versão usada do JDK, OpenSDK, JavaFX e o db.properties. São arquivos essenciais que sua máquina precisa para executar. Caso já tenha instalados, não precisa seguir os passos de instalação abaixo.

Construindo o arquivo JAR 
Checklist: 
 Construir o arquivo JAR:
  o Clique com o botão direito no nome do projeto -> Exportar -> Java/Runnable JAR file -> Próximo 
  o Selecione a classe principal 
  o Selecione a pasta de destino 
  o Manipulação de biblioteca: 3ª opção
 Empacotar arquivos:
  o Arquivo JAR 
  o db.properties 
  o MySQL Connector 
  o JavaFX SDK 
  o Java JDK
```
Passo 1: Pasta dist !
![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Seller.png)

```
Instalação 
Checklist: 
 Instalar Java: https://www.oracle.com/technetwork/java/javase/downloads/index.html
  o Configurar JAVA_HOME (ex: C:\Program Files\Java\jdk-17.0.3) 
 Copiar JavaFX 
  o Configurar PATH_TO_FX (ex: C:\java-libs\javafx-sdk\lib) 
  o Colocar MySQL Connector na pasta lib 
 Copiar JAR & db.properties 
  Executar aplicativo: 
  java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp workshop-javafx-jdbc.jar 
  application.Main
```

# Passo 2: 
Copie a pasta zulu17.46.19-ca-jdk17.0.9-win_x64 para o caminho C:\Program Files\Java. OBS: Caso não tenha a pasta Java, crie!
![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Seller.png)

# Passo 3:
Vá em propriedades do sistema -> variáveis de ambiente, crie uma variável chamada JAVA_HOME, adicione no valor da variável “C:\Program Files\Java\zulu17.46.19-ca-jdk17.0.9-win_x64” e depois clique em Ok.
![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Seller.png)

# Passo 4:
Verifique a variável Path, clique em editar e verifique se contém o %JAVA_HOME%\bin e o C:\Program Files\Java\zulu17.46.19-ca-jdk17.0.9-win_x64\bin acima de todos os outros!
![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Seller.png)

# Passo 5:
Crie uma pasta chamada java-libs no seu disco local C:, caso já tenha, basta extrair do arquivo zip “openjfx-17_windows-x64_bin-sdk” uma pasta chamada javafx-sdk-17 e colá-la em C:\java-libs, renomeie para javafx-sdk
![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Seller.png)

# Passo 6:
Vá em propriedades do sistema -> variáveis de ambiente, crie uma variável chamada PATH_TO_FX, adicione no valor da variável “C:\java-libs\javafx-sdk\lib” e depois clique em Ok.
![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Seller.png)

# Passo 7:
Vá na pasta dist\workshop-javafx-jdbc_lib -> copie o mysql-connector-j-8.2.0.jar e cole na pasta C:\java-libs\javafx-sdk\lib. 
![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Seller.png)

# Passo 8:
Inicie seu MySQL e configure-o no db.properties. !
![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Seller.png)
```

# Executar o projeto
A pasta MyApp é onde estará o executável e o db.properties. Configure-o de acordo com seu banco de dados local, e após isso basta dar dois cliques no myapp.bat.
```

# Passo 9:
Para a execução, basta abrir um cmd na pasta do MyApp e colar o código abaixo java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp workshop-javafx-jdbc.jar application.Main ou basta clicar no myapp.bat que irá executar sozinho.
  ![](https://github.com/FelipeMT21/workshop-javafx-jdbc/blob/main/assets/Tela%20Seller.png)

# Autor

João Felipe Martins da Silva

Linkedin - https://www.linkedin.com/in/jo%C3%A3o-felipe-1028aa210/

Site/Portfólio - https://felipe-developer.vercel.app/
