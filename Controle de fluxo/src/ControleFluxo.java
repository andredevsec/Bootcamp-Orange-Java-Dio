public class ControleFluxo {
    public static void main(String[] args) {
        ifFlecha();
        ifSemFlecha();
        IfFerias();
        IfMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }
    //Embora funciona, tem que ser evitado efeito flecha
    private static void ifFlecha() {
        int mes =20;
        
        if (mes==1) {
            System.out.println("Janeiro");
        } else {
            if(mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if(mes == 5) {
                            System.out.println("Maio");
                        }else {
                            if(mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if(mes == 7) {
                                    System.out.println("Julio");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else{
                                        if(mes == 9){
                                            System.out.println("Setembro");
                                        } else{
                                            if (mes==10){
                                                System.out.println("Outubro");
                                            }else {
                                                if(mes == 11) {
                                                    System.out.println("Novembro");
                                                }else{
                                                    if(mes == 12){
                                                        System.out.println("Dezembro");
                                                    }else{
                                                        System.out.println("Mes indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }


    //Esteticamente, o if sem flecha fica melhor
    private static void ifSemFlecha () {
        int mes = 9;

        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes ==2) {
            System.out.println("Fevereiro");
        } else if (mes ==3) {
            System.out.println("Março");
        } else if (mes ==4) {
            System.out.println("Abril");
        } else if (mes ==5) {
            System.out.println("Maio");
        } else if (mes ==6) {
            System.out.println("Junho");
        } else if (mes ==7) {
            System.out.println("Julio");
        } else if (mes ==8) {
            System.out.println("Agosto");
        } else if (mes ==9) {
            System.out.println("Setembro");
        } else if (mes ==10) {
            System.out.println("Outubro");
        } else if (mes ==11) {
            System.out.println("Novembro");
        } else if (mes ==12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mes indefinido");
        }
    }

    //Como não usar o if, por que temos um valor exato, switch seria melhor
    private static void IfFerias() {
        String mes = "julho";

        if (mes == "julho" || mes == "Dezembro" || mes == "janeiro"){
            System.out.println("Ferias");
        }
    }

    private static void IfMenor() {
        double salarioMensal = 11893.53d;
        double mediaSalarial = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes)){
            System.out.println("Funcionário deve receber auxílio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes > mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionario deve receber auxilio");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if(recebeAuxilio){
            System.out.println("Funcionario deve receber auxilio");
        } else {
            System.out.println("Funcionario nao deve receber auxilio");
        }
    }

    private static void switchSemana () {
        String dia = "Terça";
        switch (dia){
            case "Segunda":
            System.out.println(2);
            break;
            case "Terça":
            System.out.println(3);
            break;
            case "Quarta":
            System.out.println(4);
            break;
            case "Quinta":
            System.out.println(5);
            break;
            case "Sexta":
            System.out.println(6);
            break;
            case "Sabado":
            System.out.println(7);
            break;
            case "Domingo":
            System.out.println(1);
            break;
            default:
            System.out.println("Dia invalido");
            break;
        }
    }

    private static void switchNumero () {
        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }

    private static void switchFerias () {
    String mes = "dezembro";
    switch (mes) {
        case "dezembro":
        case "julho":
        case "janeiro":
            System.out.println("Ferias");
            break;    
        default:
            System.out.println("Mes indefinido");
            break;
    }
    }
}
