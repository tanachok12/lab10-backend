package se331.rest.dao;

import org.springframework.data.domain.Page;
import se331.rest.entity.Organizer;

import java.awt.print.Pageable;
import java.util.Optional;

public interface OrganizerDao {
    Page<Organizer> getOrganizer(Pageable pageRequest);
    Optional<Organizer> findById(Long id);

    Page<Organizer> getOrganizer(org.springframework.data.domain.Pageable pageRequest);
}
