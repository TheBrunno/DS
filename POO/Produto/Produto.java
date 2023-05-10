
public class Produto {
	private int id;
	private String produto;
	private String descricaoProduto;
	private double valor;
	private int data[] = new int[3];
	
	public int getId() {
		return id;
	}
	public String getProduto() {
		return produto;
	}
	public String getDescricao() {
		return descricaoProduto;
	}
	public double getValor() {
		return valor;
	}
	public String getData() {
		return data[0]+"/"+data[1]+"/"+data[2];
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public void setDescricao(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setData(int dia, int mes, int ano) {
		data[0] = dia;
		data[1] = mes;
		data[2] = ano;
	}
}
