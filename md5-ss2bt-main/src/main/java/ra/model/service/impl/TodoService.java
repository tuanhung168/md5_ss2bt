package ra.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.entity.Todo;
import ra.model.repository.impl.TodoRepository;
import ra.model.service.ITodoService;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TodoService implements ITodoService {
    @Autowired
    private TodoRepository todoRepository;
    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo findByID(Long id) {
        return todoRepository.findByID(id);
    }

    @Override
    public void save(Todo p) {
        todoRepository.save(p);
    }

    @Override
    public void delete(Long id) {
        todoRepository.delete(id);
    }
}
