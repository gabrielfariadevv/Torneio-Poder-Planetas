<!-- Configuração do Banco de Dados para o Torneio -->

<h2>Script do Banco de Dados:</h2>

<p>
    <!-- Criação do banco de dados 'torneio' -->
    <code>CREATE DATABASE torneioPlanetas;;</code>
</p>

<p>
    <!-- Utilização do banco de dados 'torneio' -->
    <code>USE torneioPlanetas;</code>
</p>

<p>
    <!-- Criação da tabela 'arena' -->
    <code>
        CREATE TABLE planeta (
            id INT,
            planetName VARCHAR(255),
            location VARCHAR(255),
            ruler VARCHAR(255),
            topScorer VARCHAR(255),
            PRIMARY KEY (id)
);
    </code>
</p>

<!-- Configuração do Aplicativo Spring Boot -->

<h2>Configuração do Aplicativo Spring Boot:</h2>

<ol>
    <li>
        <!-- Passo 1: Abra o arquivo 'application.properties' no projeto -->
        <p>Abra o arquivo <code>application.properties</code> no projeto.</p>
    </li>
    <li>
        <!-- Passo 2: Insira suas credenciais do banco de dados -->
        <p>Insira suas credenciais do banco de dados no arquivo <code>application.properties</code>:</p>
        <pre>
spring.application.name=torneioPlanetas
spring.datasource.url=jdbc:mysql://localhost:3306/torneioPlanetas
spring.datasource.username=seu_usuario
spring.datasource.password=>sua_senha
spring.jpa.hibernate.ddl-auto=update
        </pre>
        <p>Substitua <code>seu_usuario</code> e <code>sua_senha</code> pelo nome de usuário e senha do seu banco de dados MySQL.</p>
    </li>
</ol>
