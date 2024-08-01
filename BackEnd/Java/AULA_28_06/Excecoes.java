package AULA_28_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Excecoes {
    public static void main(String[] args) {
        // try {
        //     //Código que pode lançar uma exceção
        //     int [] numeros = {1,2,3};
        //     System.out.println("O numero na posicao 4 é: " + numeros[2]);
        //     int resultado = 10/0;
        //     System.out.println(resultado);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     // TODO: handle exception
        //     //Tratamento de exceção
        //     System.out.println("Erro: Tentativa de acessar um indice fora dos limites do array.");
        // } catch (ArithmeticException e){
        //     System.out.println("Erro: Tentativa de divisão por zero");
        // } finally{
        //     System.out.println("Este bloco 'finally' sera sempre executado");
        // }
        // System.out.println("O programa continua executando normalmente após o tratamento da exceção.");

        Connection connection = null;
        Statement statement = null;

        try{
            //Parâmetros de conexão
            String url = "jdbc:postgresql://localhost:5432/aulasSoulcode";
            String user = "postgres";
            String password = "7cHe51n@2023";

            //Estabelecendo a conexão
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");

            //Criando uma declaração
            statement = connection.createStatement();
            String sql = "SELECT * FROM clientes";
            statement.executeQuery(sql);
            System.out.println("Consulta realizada com sucesso!");
        } catch (SQLException e){
            //Tratamento de exceção
            System.out.println("Erro ao conectar ou executar a consulta: " + e.getMessage());
        } finally {
            //Fechando a declaração e a conexão
            try {
                if(statement != null){
                    statement.close();
                    System.out.println("Statement fechado com sucesso!");
                }
                if (connection != null){
                    connection.close();
                    System.out.println("Conexão fechada com sucesso!");
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar os recursos: " + e.getMessage());
            }
        }

    }
}
//pomxml
// <dependencies>
//     <!-- Dependência do Spring Boot Starter Data JPA -->
//     <dependency>
//         <groupId>org.springframework.boot</groupId>
//         <artifactId>spring-boot-starter-data-jpa</artifactId>
//     </dependency>
    
//     <!-- Dependência do driver PostgreSQL -->
//     <dependency>
//         <groupId>org.postgresql</groupId>
//         <artifactId>postgresql</artifactId>
//         <scope>runtime</scope>
//     </dependency>
    
//     <!-- Dependência do Spring Boot Starter Web -->
//     <dependency>
//         <groupId>org.springframework.boot</groupId>
//         <artifactId>spring-boot-starter-web</artifactId>
//     </dependency>
// </dependencies>

//applicationproperties
// spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco_de_dados
// spring.datasource.username=seu_usuario
// spring.datasource.password=sua_senha
// spring.jpa.hibernate.ddl-auto=update
// spring.jpa.show-sql=true
// spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

//entidade
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// @Entity
// public class User {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String name;
//     private String email;

//     // Getters e Setters
//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }
// }

// repositorio
// import org.springframework.data.jpa.repository.JpaRepository;

// public interface UserRepository extends JpaRepository<User, Long> {
// }

//service
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class UserService {
//     @Autowired
//     private UserRepository userRepository;

//     public List<User> getAllUsers() {
//         return userRepository.findAll();
//     }

//     public User getUserById(Long id) {
//         return userRepository.findById(id).orElse(null);
//     }

//     public User createUser(User user) {
//         return userRepository.save(user);
//     }

//     public User updateUser(Long id, User userDetails) {
//         User user = userRepository.findById(id).orElse(null);
//         if (user != null) {
//             user.setName(userDetails.getName());
//             user.setEmail(userDetails.getEmail());
//             return userRepository.save(user);
//         }
//         return null;
//     }

//     public void deleteUser(Long id) {
//         userRepository.deleteById(id);
//     }
// }

//Controlador
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/users")
// public class UserController {
//     @Autowired
//     private UserService userService;

//     @GetMapping
//     public List<User> getAllUsers() {
//         return userService.getAllUsers();
//     }

//     @GetMapping("/{id}")
//     public User getUserById(@PathVariable Long id) {
//         return userService.getUserById(id);
//     }

//     @PostMapping
//     public User createUser(@RequestBody User user) {
//         return userService.createUser(user);
//     }

//     @PutMapping("/{id}")
//     public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
//         return userService.updateUser(id, userDetails);
//     }

//     @DeleteMapping("/{id}")
//     public void deleteUser(@PathVariable Long id) {
//         userService.deleteUser(id);
//     }
// }

// mvn spring-boot:run