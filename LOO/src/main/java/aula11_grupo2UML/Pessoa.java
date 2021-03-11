package aula11_grupo2UML;


public abstract class Pessoa {
	
	protected String nome;
	protected String telefone;
	protected String rua;
	protected String bairro;
	protected int num;
	protected String municipio;
	protected String uf;
	
	public Pessoa(String nome, String telefone, String rua, String bairro, int num, String municipio, String uf) {
		nome = nome.replaceAll("[^A-Z | ^a-z]", "");
		this.nome = nome;
		telefone = telefone.replaceAll("[^0-9]", "");
		if (telefone.length() < 9) {
			System.out.println("Telefone n possui menos de 9 numeros");
			System.exit(0);
		}
		this.telefone = telefone;
		rua = rua.replaceAll("[^A-Z | ^a-z]", "");
		this.rua = rua;
		bairro = bairro.replaceAll("[^A-Z | ^a-z]", "");
		this.bairro = bairro;
		this.num = num;
		municipio = municipio.replaceAll("[^A-Z | ^a-z]", "");
		this.municipio = municipio;
		uf = uf.replaceAll("[^A-Z | ^a-z]", "");
		this.uf = uf;
	}
	
	public void mostraPessoa() {
		
		System.out.println(nome);
		System.out.println(telefone);
		
	}
	
	public void mostraEndereco() {
		
		System.out.println(rua);
		System.out.println(bairro);
		System.out.println(num);
		System.out.println(municipio);
		System.out.println(uf);
		
	}
	
	public void mostraPessoaeEndereco() {
		
		System.out.println(nome);
		System.out.println(telefone);
		System.out.println(rua);
		System.out.println(bairro);
		System.out.println(num);
		System.out.println(municipio);
		System.out.println(uf);
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
