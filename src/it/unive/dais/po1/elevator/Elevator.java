package it.unive.dais.po1.elevator;
/**
 *  @invariant this.getCurrentFloor() >= 0 &&
 *                      this.getCurrentFloor() <= this.getTopFloor();
 *
 */
public class Elevator {

    //@invariant this.getCurrentFloor() >= 0 &&
    //                       this.getCurrentFloor() <= this.getTopFloor();
    private int current_floor;
    //@invariant topFloor >= 0
    private final int topFloor;
    //@invariant capacity >= 0
    private final int capacity;
    //@invariant passengers >= 0 && passengers <= capacity;
    private int passengers;

    private boolean invariant() {
        return this.getFloor() >= 0 && this.getFloor() <= this.getTopFloor() &&
                this.getPassengers() >= 0 && this.getPassengers() <= this.getCapacity() &&
                this.getTopFloor() >= 0 && this.getCapacity() >= 0;
    }

    /**
     * Creates an elevator with the given top floor and capacity.
     * @param topFloor the top floor of the building
     * @param capacity the capacity of the elevator
     *
     * @requires topFloor >= 0 && capacity >= 0
     */
    public Elevator(int topFloor, int capacity) {
        assert topFloor >= 0 : "Floor cannot be "+topFloor;
        assert capacity >= 0 : "Capacity cannot be "+capacity;

        this.topFloor = topFloor;
        this.capacity = capacity;
        this.current_floor = 0;//ground floor
        this.passengers = 0;
        assert invariant();
    }

    /**
     * Moves the elevator to the given floor.
     *
     * @param target the floor to move to
     *
     * @requires target >= 0 && target <= this.getTopFloor()
     * @ensures this.getCurrentFloor() == target
     */
    public void moveTo(int target) {

        assert invariant();
        if(target >= 0 && target <= topFloor) {
            this.current_floor = target;
        }
        assert this.current_floor == target;

        assert invariant();
    }

    /**
     * Lets some people board the elevator,
     * as many as there is room for.
     *
     * @param people the number of people
     *        who want to board
     * @return the number of passengers
     *      inside the elevator after the boarding
     *
     * @requires people >= 0 &&
     *          this.getPassengers() + people <= this.getCapacity()
     * @ensures this.getPassengers() == pre(this.getPassengers()) + people
     * @ensures @return = this.getPassengers()
     */
    public int board(int people) {
        assert invariant();
        int pre_this_passengers = this.passengers;
        int result = this.passengers;
        if(people > 0 && this.passengers + people <= capacity) {
            this.passengers = this.passengers + people;
            result = this.passengers;
        }
        else result = this.passengers;
        assert this.passengers == pre_this_passengers + people;
        assert result == this.passengers;
        assert invariant();
        return result;
    }

    /**
     * Let some people leave the elevator,
     *
     * @param people the number of people to leave
     * @return the number of passengers inside the elevator after leaving
     *
     * @requires people >= 0
     * @ensures pre(this.getPassengers()) >= people =>
     *              this.getPassengers() == pre(this.getPassengers()) - people
     * @ensures pre(this.getPassengers()) < people =>
     *              this.getPassengers() == 0
     * @ensures @return = this.getPassengers()
     */
    public int leave(int people) {
        assert people >= 0;
        assert invariant();
        int pre_this_passengers = this.passengers;
        int result = this.passengers;
        if(people > 0) {
            if (this.passengers - people >= 0) {
                this.passengers = this.passengers - people;
                result = this.passengers;
            }
            else {
                this.passengers = 0;
                result = this.passengers;
            }
        }
        else result = this.passengers;
        if(pre_this_passengers >= people)
            assert this.passengers == pre_this_passengers - people;
        if(pre_this_passengers < people)
            assert this.passengers == 0;

        assert invariant();
        return result;
    }

    public int evacuate() {
        assert this.invariant();
        int left = this.passengers;
        this.passengers =
                this.passengers - left - 1;   //BUG
        assert this.invariant();
        return left;
    }


    /**
     * The current of the elevator.
     * @return the current floor
     */
    public int getFloor() {
        return this.current_floor;
    }

    /**
     * The number of passengers inside the elevator.
     * @return the number of passengers
     */
    public int getPassengers() {
        return this.passengers;
    }

    /**
     * The top floor of the building.
     * @return the top floor
     */
    public int getTopFloor() {
        return topFloor;
    }

    /**
     * The capacity of the elevator.
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }
}

