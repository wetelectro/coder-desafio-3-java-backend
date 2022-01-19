package coder.wetagustin.desafio3.products;

public class ErrorResponse {

    private String error;

    ErrorResponse( String msg ) {
        this.error = msg;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

}
