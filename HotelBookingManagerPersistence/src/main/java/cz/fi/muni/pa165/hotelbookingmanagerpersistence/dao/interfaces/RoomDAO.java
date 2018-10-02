package cz.fi.muni.pa165.hotelbookingmanagerpersistence.dao.interfaces;

import cz.fi.muni.pa165.hotelbookingmanagerpersistence.entities.Room;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Andrej Galád
 */
public interface RoomDAO {

    /**
     * Adds new room to the database.
     *
     * @param room Room to create
     * @throws IllegalArgumentException if room is null or if Hotel parameter of room is null or if ID of room is already set
     * @throws ConstraintViolationException if room has any invalid parameter
     * @throws DataAccessException in case of error.
     */
    void create (Room room);

    /**
     * Returns room with given id.
     *
     * @param id ID of the Room to get
     * @return Room with the entered ID
     * @throws IllegalArgumentException if id is null
     * @throws DataAccessException in case of error.
     */
    Room get(Long id);

    /**
     * Updates existing room.
     *
     * @param room Room to update
     * @throws IllegalArgumentException if room is null
     * @throws DataAccessException in case of error.
     */
    void update (Room room);

    /**
     * Removes existing room.
     *
     * @param room Room to delete
     * @throws IllegalArgumentException if room is null
     * @throws ConstraintViolationException if room has any invalid parameter
     * @throws DataAccessException in case of error.
     */
    void delete (Room room);

    /**
     * Returns list of all vacant rooms in the database.
     *
     * @param from Start of interval
     * @param to End of interval
     * @return List of all vacant rooms
     * @throws DataAccessException in case of error.
     */
    List<Room> findAllVacantRooms(Date from, Date to);

    /**
     * Returns true if the room is vacant between the from and to dates, false otherwise
     * @param room room, which vacancy is to be checked
     * @param from the beginning of the date interval
     * @param to the end of the date interval
     * @return true if the room is vacant between the from and to dates, false otherwise
     * @throws DataAccessException in case of error.
     */
    boolean isVacant(Room room, Date from, Date to);

    /**
     * Returns list of all rooms in the database.
     *
     * @return List of all Rooms
     * @throws DataAccessException in case of error.
     */
    List<Room> findAllRooms();
}
