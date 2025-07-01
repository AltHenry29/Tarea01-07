package Login;

import Datos.Datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JPanel panelMain;
    private JButton accesoButton;
    private JTextField txtUser;
    private JPasswordField txtpass;
    private JComboBox boxmul;

    public Login() {
        setTitle("Login");
        setContentPane(panelMain);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

//        JLabel lblnombre= new JLabel("Jugadores");
//        lblnombre.setBounds(50,5,100,25);
//
//        JTextField txtNombre = new JTextField("N");
//        txtNombre.setBounds(75,10,100,50);
//
//        JButton accion = new JButton("Clic");
//        accion.setBounds(150,5,100,50);
//        panelMain.add(lblnombre,txtNombre); //Solo 1 creacion.
//        panelMain.add(accion);

        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUser.getText();
                String contrasena = new String(txtpass.getPassword());
                String rol = (String) boxmul.getSelectedItem();

                if (usuario.isEmpty() || contrasena.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El usuario y/o contraseña estan vacios");
                    return;
                }

                if (usuario.equals("admin") && contrasena.equals("123") && rol.equals("Administrador")) {
                    JOptionPane.showMessageDialog(null,"Bienvenido");
                    new Datos().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }

            }
        });
    }

    public static void main(String[] args){
        new Login().setVisible(true);
    }
}

//
//btnIngresar.addActionListener(e -> {
//String usuario = txtUsuario.getText();
//String clave = new String(txtClave.getPassword());
//            if (usuario.equals("cliente123") && clave.equals("clave456")) {
//        new BancoForm(usuario).setVisible(true);
//dispose();
//            } else {
//                    JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
//            }
//                    });