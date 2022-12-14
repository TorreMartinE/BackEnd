/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquitecturajava.testing.test;

import static org.junit.Assert.*;

import com.arquitecturajava.testing.ConfiguradorSpring;
import com.arquitecturajava.testing.Servicio;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConfiguradorSpring.class})
public class SpringTest {
    
    @Autowired
    private Servicio miservicio;
    @Test
    
           public void test() {
               
               assertEquals(2,miservicio.buscarTodas().size());
           }
}
        