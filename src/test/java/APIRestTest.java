import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;


public class APIRestTest {
    
    
        @BeforeClass
        public static void setup() {
            RestAssured.baseURI = "http://localhost:8080/tasks-backend";
        }
    

	@Test
	public void deveRornarTarefas() {
            RestAssured.given()
                        .log().all()
                    .when()
                        .get("/todo")
                    .then()
                        .log().all()
                        .statusCode(200)
                    ;
	}
        
        //@Test
        //public void deveAdicionarTarefaComSucesso() {
        //    RestAssured.given()
        //                .body("{\"task\":\"Teste via API\", \"dueDate\":\"2020-12-30\"}")
        //                .contentType(ContentType.JSON)
        //                .log().all()
        //            .when()
        //                .post("/todo")
        //            .then()
        //                .statusCode(201)
        //            ;
        //    
        //}
     

}
