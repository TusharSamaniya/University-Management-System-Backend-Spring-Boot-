package com.university.service;

import com.university.entity.Alumini;

public interface IAluminiService {
	
	public Alumini registerIndividualAlumini(Alumini alumini);
	public String registerAllAlumini(Iterable<Alumini> alumini);
	public Iterable<Alumini> getAlumini();

}
