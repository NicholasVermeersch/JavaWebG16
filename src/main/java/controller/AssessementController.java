/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.User;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author rerre
 */
@Controller
public class AssessementController
{

    @RequestMapping(value = {"assessementIndienen"}, method = RequestMethod.POST)
    public void assessementBeoordelen(@Valid User user, Model model)
    {
        

    }
}
