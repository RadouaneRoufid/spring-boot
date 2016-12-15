package com.roufid.tutorial.listner;

import java.util.Iterator;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.core.support.DefaultRepositoryMetadata;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Component;

import com.roufid.tutorial.repository.BookRepository;

@Component
public class ContextRefreshedEventListner {

	@Autowired
	private ListableBeanFactory listableBeanFactory;

	@EventListener
	public void handleContextRefresh(ContextRefreshedEvent event) {
		displayRepositories();
		displayUsingListableBeanFactory();
	}

	@SuppressWarnings("rawtypes")
	private void displayRepositories() {
		
		Repositories repositories = new Repositories(listableBeanFactory);

		Iterator<Class<?>> it = repositories.iterator();
		while (it.hasNext()) {
			Class<?> domainType = it.next();
			Repository repository = (Repository) repositories.getRepositoryFor(domainType);

			System.out.println("The domain of the repository [" + repository + "] is : " + domainType);
		}
	}

	public void displayUsingListableBeanFactory() {

		DefaultRepositoryMetadata drm = new DefaultRepositoryMetadata(BookRepository.class);
		Class<?> domainType = drm.getDomainType();

		System.out.println(domainType);
	}

}
