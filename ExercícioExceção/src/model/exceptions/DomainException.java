package model.exceptions;

public class DomainException extends RuntimeException { // mudar para RuntimeException
	private static final long serialVersionUID = 1L; // pode ser uma extensão da classe exception ou do runtimeexception, só
													// que runtime não é obrigado a tratar.
   public DomainException(String msg) {
	   super(msg); // repassou para o construtor da superclasse, permitir que ele possa instanciar a exceção personalizada, passando uma msg pra ela.
   }
}
