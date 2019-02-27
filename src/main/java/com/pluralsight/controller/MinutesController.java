package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("Exercise " + exercise.getMinutes());
		// 1//return "forward:addMoreMinutes.html";
		// 2//return "redirect:addMoreMinutes.html";
		return "addMinutes";
	}

	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivity() {

		List<Activity> activities = new ArrayList<Activity>();

		Activity activity = new Activity();
		activity.setDesc("Run");
		activities.add(activity);
		
		Activity activity1 = new Activity();
		activity.setDesc("Bike");
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		activity.setDesc("Swim");
		activities.add(activity2);
		
		return activities;
	}

	/*
	 * @RequestMapping(value = "/addMoreMinutes") public String
	 * addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
	 * 
	 * System.out.println("Exercising " + exercise.getMinutes()); return
	 * "addMinutes"; }
	 */

}
