package se331.rest.dao;

import org.springframework.data.domain.Page;
import se331.rest.entity.Organizer;

import java.awt.print.Pageable;

public interface OrganizerDao {
    Page<Organizer> getOrganizer(Pageable pageRequest);

    Page<Organizer> getOrganizer(org.springframework.data.domain.Pageable pageRequest);
}
