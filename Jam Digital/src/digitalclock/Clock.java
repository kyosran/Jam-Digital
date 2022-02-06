
package digitalclock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Clock extends javax.swing.JFrame implements Runnable {
        int hour,second,minute;
        int day,month,year;
        String stime,syear;
        
    
    public Clock() {
        Thread t=new Thread(this);
        t.start();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DigitalClock");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 5));
        jPanel1.setLayout(null);

        time.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        time.setForeground(new java.awt.Color(51, 153, 0));
        jPanel1.add(time);
        time.setBounds(50, 40, 260, 50);

        date.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        date.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(date);
        date.setBounds(100, 100, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\clock.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(5, 5, 340, 189);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true)
        {
            try{
                Calendar c=Calendar.getInstance();
                hour=c.get(Calendar.HOUR_OF_DAY);
                if(hour>12)
                {
                    hour=hour-12;
                }
                minute=c.get(Calendar.MINUTE);
                second=c.get(Calendar.SECOND);
                year=c.get(Calendar.YEAR);
                month=c.get(Calendar.MONTH);
                day=c.get(Calendar.DAY_OF_MONTH);
                SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
                SimpleDateFormat sdf1=new SimpleDateFormat("MM:dd:yyyy");
                Date d=c.getTime();
                stime=sdf.format(d);
                syear=sdf1.format(d);
                time.setText(stime);
                date.setText(syear);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
