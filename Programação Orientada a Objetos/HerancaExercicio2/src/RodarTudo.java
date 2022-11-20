public class RodarTudo {

    Funcionario funcionario = new Funcionario();

    //upcast
    Funcionario gerente = new Gerente();
    Funcionario vendedor = new Vendedor();
    Funcionario faxineiro = new Faxineiro();

    //downcast
    Vendedor vendedor = (Vendedor) new Funcionario();


}
