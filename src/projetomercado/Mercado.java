package projetomercado;

import java.util.Vector;

public class Mercado {

	//private Vector<Produto> produtos;
	//private Vector<Cliente> clientes;
	//private Vector<RegistroVenda> registrosVendas;

	static GerenciamentoProdutos gProdutos = new GerenciamentoProdutos();

	public static void main(String args[])
	{
		gProdutos.insereProduto(11111, "este eh o produto 1", 1.00, 5.99, "cm", 10.5, 1);
		//gProdutos.insereProduto(22222, "e este eh o produto 2", 2.00, 7.99, "kg", 10.5, 1);
		//gProdutos.insereProduto(33333, "por fim o produto 3", 3.00, 10.99, "mm", 10.5, 1);
		gProdutos.listaProdutos();
		gProdutos.alteraEstoque(11111, 0);
		gProdutos.listaProdutos();
	}

	// TODO: calculaFaturamento
	public double calculaFaturamento(int mes){
		return 0.0f;
	}

	// TODO: consultaProdutos
	public int[] consultaProdutos(String descricao){
		return null;
	}

}