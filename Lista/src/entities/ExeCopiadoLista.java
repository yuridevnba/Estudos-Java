package entities;

public class ExeCopiadoLista {

	private String nome_material;
	private Integer id;
	private Double preco;

	public ExeCopiadoLista(){
		
		
	}

	public ExeCopiadoLista(Integer id,String nome_material,  Double preco) {
		this.nome_material = nome_material;
		this.id = id;
		this.preco = preco;
		

	}

	public String getNome_material() {
		return nome_material;
	}

	public void setNome_material(String nome_material) {
		this.nome_material = nome_material;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	//public void setPreco(Double preco) {
		//this.preco = preco;
	//}

	public Double desconto(double percent) {
		return preco-=(preco*percent) /100;
		//return preco++;
	}




	public String toString() {
		return "ID: "+id+"/ NOME: "+nome_material+"/Preço: "+String.format("%.2f%n", preco);
	}

	}


