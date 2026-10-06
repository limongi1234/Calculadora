# Calculadora em Java

Calculadora desktop em **Java (Swing)** desenvolvida no NetBeans. O projeto tem duas versões:

- **`frmCalculadora`**: calculadora com interface gráfica (botões e visor).
- **`Main`**: calculadora com menu em caixas de diálogo (`JOptionPane`) para adição, subtração, divisão e multiplicação.

## Como executar

### No NetBeans
Abra a pasta do projeto em *File → Open Project* e clique em *Run*.

### Pelo terminal
Requer JDK 17 ou superior.

```bash
javac -cp lib/AbsoluteLayout.jar -d out src/primeiroaplicativojava/*.java

# Calculadora com interface gráfica
java -cp out:lib/AbsoluteLayout.jar primeiroaplicativojava.frmCalculadora

# Versão com menu em caixas de diálogo
java -cp out:lib/AbsoluteLayout.jar primeiroaplicativojava.Main
```

No Windows, troque `:` por `;` no `-cp`.

## Estrutura

```
src/primeiroaplicativojava/
  frmCalculadora.java   Interface gráfica da calculadora
  Main.java             Versão com menu (JOptionPane)
  Operacoes.java        Operações e leitura dos números
lib/AbsoluteLayout.jar  Layout usado pelo editor visual do NetBeans
nbproject/              Configuração do projeto NetBeans
```
