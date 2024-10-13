package org.multi_data_source.secondary;

import org.multi_data_source.secondary.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPositionRepository extends JpaRepository<Position,Long> {
}
