package prototype.second.factory;

import prototype.second.entity.Project;

/**Класс-фабрика для создания копий проектов**/
public class ProjectFactory {

    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    /**Возвращает копию имеющегося проекта**/
    public Project cloneProject(){
        return (Project) project.clone();
    }
}
