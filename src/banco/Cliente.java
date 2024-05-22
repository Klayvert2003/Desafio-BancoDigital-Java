package banco;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
    private final String nome;
    private final String cpf;
    private final LocalDate dataNascimento;

    private static final String CPF_REGEX = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";

    public Cliente(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = validarFormatoCPF(cpf);
        this.dataNascimento = dataNascimento;
    }

    public static String validarFormatoCPF(String cpf) {
        Pattern pattern = Pattern.compile(CPF_REGEX);
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.matches()) return cpf;

        throw new RuntimeException("CPF Inválido, formato correto: xxx.xxx.xxx-xx");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
