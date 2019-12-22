package com.start;

import javax.swing.*;
import java.awt.*;

public class Ui {
    // 15 single 15 double 10 triple 10 familly
    final int rooms = 50;
    static void start_view() {
        JFrame frame = new JFrame("Hotel mangment");
        frame.setBounds(300,100,1400,900);

        JPanel p0, p1 , p2 , p3, p4;
        p0 = new JPanel();p2 = new JPanel(); p3 = new JPanel();p4 = new JPanel();
        p0.setLayout(null);p2.setLayout(null); p3.setLayout(null);p4.setLayout(null);

        p0.setBounds(0,0,1400,900);

        //p2.setBackground(Color.green.darker());
        p2.setBounds(0,40, 1400, 60);

        p3.setBackground(Color.cyan.darker());
        p3.setBounds(0,100, 300, 800);

        p4.setBackground(Color.gray.brighter());
        p4.setBounds(300,100, 1100, 800);

        JLabel current_date = new JLabel(home.get_date());
        current_date.setBounds(20,0,150,60);
        current_date.setHorizontalAlignment(SwingConstants.CENTER);
        current_date.setFont(current_date.getFont().deriveFont(current_date.getFont().getSize() + 10f));

        JLabel current_time = new JLabel(home.get_time());
        current_time.setBounds(1250,0,100,60);
        current_time.setHorizontalAlignment(SwingConstants.CENTER);
        current_time.setFont(current_date.getFont());

        JLabel status = new JLabel("Status");
        status.setBounds(10,5,100,40);
        status.setHorizontalAlignment(SwingConstants.LEFT);
        status.setForeground(Color.white);
        status.setFont(status.getFont().deriveFont(status.getFont().getSize() + 8f));

        JLabel type = new JLabel("Type");
        type.setBounds(10,210,100,40);
        type.setHorizontalAlignment(SwingConstants.LEFT);
        type.setForeground(Color.white);
        type.setFont(status.getFont());

        JLabel hoskep = new JLabel("House Keeping");
        hoskep.setBounds(10,415,100,40);
        hoskep.setHorizontalAlignment(SwingConstants.LEFT);
        hoskep.setForeground(Color.white);
        hoskep.setFont(status.getFont());

        JLabel single = new JLabel("Single");
        single.setBounds(10,15,100,40);
        single.setHorizontalAlignment(SwingConstants.LEFT);
        single.setForeground(Color.blue);
        single.setFont(status.getFont().deriveFont(status.getFont().getSize() + 8f));

        p2.add(current_date);p2.add(current_time);
        p3.add(status);p3.add(type);p3.add(hoskep);
        p3.add(stats("Reserved",12 , 40));
        p3.add(stats("Occupied",5 , 80));
        p3.add(stats("Available",20 , 120));
        p3.add(stats("Checked out",6 , 160));

        p3.add(stats("Single",8 , 245));
        p3.add(stats("Double",14 , 285));
        p3.add(stats("Triple",5 , 325));
        p3.add(stats("Family",3 , 365));

        p3.add(stats("Clean",8 , 450));
        p3.add(stats("Not Clean",14 , 490));
        p3.add(stats("In Progress",5 , 530));
        p3.add(stats("Repair",3 , 570));

        p4.add(single);
        p0.add(p2);p0.add(p3);p0.add(p4);
        frame.setContentPane(p0);
        //frame.setUndecorated(true);
        frame.setVisible(true);
    }
    static Component stats(String label , int count , int height){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.cyan.darker());
        panel.setBounds(10,height, 280, 40);

        JLabel l1 = new JLabel(label) , l2 = new JLabel(""+count);
        l1.setBounds(50,0,200,40);
        l1.setHorizontalAlignment(SwingConstants.LEFT);
        l1.setFont(l1.getFont().deriveFont(l1.getFont().getSize() + 5f));

        l2.setBounds(250,0,30,40);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setFont(l1.getFont());

        panel.add(l1); panel.add(l2);
        return panel;
    }
}
