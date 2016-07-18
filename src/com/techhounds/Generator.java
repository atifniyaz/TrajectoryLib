package com.techhounds;

import com.team254.lib.trajectory.Path;
import com.team254.lib.trajectory.PathGenerator;
import com.team254.lib.trajectory.WaypointSequence;
import com.team254.lib.trajectory.WaypointSequence.Waypoint;

public class Generator extends Functions {

	public static final double dt = .01, max_acc = 220.0, max_jerk = 480.0, max_vel = 110.0;

	static final double wheelBase_width = 24.0;
	static String directory = "../TrajectoryLibrary-Build/paths";
	static String workingDirectory = "../TrajectoryLibrary-Build/paths/trajectory";

	public static void main(String[] args) {

		config.dt = .01;
		config.max_acc = 220.0;
		config.max_jerk = 480.0;
		config.max_vel = 110.0;

		// Defense Crossings
		createLowBarCross();
		createMoatCross();
		createRampartsCross();
		createRoughTerrainCross();
		createRockWallCross();
		createSallyCross();
		
		// Position Movements after Crossing
		/*createPositionTwoShot();
		createPositionThreeShot();
		createPositionFiveShot();
		
		// Cheval Special
		createChevalPositionShot();
		createChevalGoBack();*/
	}
	
	public static void createLowBarCross() {
		
		{
			config(0.825);

			final String path_name = "LowBarOneBall";

			WaypointSequence p = new WaypointSequence(10);
			p.addWaypoint(new Waypoint(0, 0, 0));
			p.addWaypoint(new Waypoint(48, 36 - 5, 0));
			p.addWaypoint(new Waypoint(90, 36 - 5, 0));
			p.addWaypoint(new Waypoint(190 + 24, -10, -Math.PI * 57.0 / 180));
			//p.addWaypoint(new Waypoint(160, -10, -Math.PI / 4));
			Path path = PathGenerator.makePath(p, config, 24, path_name);

			create(path, directory, workingDirectory, path_name, false);
			create(path, directory, workingDirectory, path_name + "-Back", true);
		}

		{
			config(0.68);

			final String path_name = "LowBarTwoBall-Back";

			WaypointSequence points = new WaypointSequence(10);
			points.addWaypoint(new Waypoint(6, 26, -Math.PI * 5.0 / 180));
			points.addWaypoint(new Waypoint(35, 24, 0));
			points.addWaypoint(new Waypoint(86, 24, 0));
			points.addWaypoint(new Waypoint(120, 24, 0));
			points.addWaypoint(new Waypoint(190 + 24, 0, -Math.PI * 20.0 / 180));

			Path path = PathGenerator.makePath(points, config, wheelBase_width, path_name);

			create(path, directory, workingDirectory, path_name, true);
		}
		
		{
			config(0.85);

			final String path_name = "LowBarTwoBall-Cross";
			
			WaypointSequence points = new WaypointSequence(10);
			points.addWaypoint(new Waypoint(6, 2 + 46, -Math.PI * 5.0 / 180));
			points.addWaypoint(new Waypoint(35, 5 + 46, 0));
			points.addWaypoint(new Waypoint(86, 5 + 46, 0));
			points.addWaypoint(new Waypoint(90, 5 + 46, 0));
			points.addWaypoint(new Waypoint(190 + 24, 0, -Math.PI * 57.0 / 180));	
		
			Path path = PathGenerator.makePath(points, config, wheelBase_width, path_name);

			create(path, directory, workingDirectory, path_name, false);
		}
		
		{
			config(0.8);

			final String path_name = "LowBarAutoBall-Back";

			WaypointSequence points = new WaypointSequence(10);
			points.addWaypoint(new Waypoint(0, 15, 0));
			points.addWaypoint(new Waypoint(86, 15, 0));
			points.addWaypoint(new Waypoint(150, 15, 0));
			points.addWaypoint(new Waypoint(190, 0, -Math.PI * 57.0 / 180));

			Path path = PathGenerator.makePath(points, config, wheelBase_width, path_name);

			create(path, directory, workingDirectory, path_name, true);
		}
		
		{
			config(0.8);

			final String path_name = "LowBarAutoBall-Cross";
			
			WaypointSequence points = new WaypointSequence(10);
			points.addWaypoint(new Waypoint(0, 0, 0));
			points.addWaypoint(new Waypoint(48, 0, 0));
			points.addWaypoint(new Waypoint(150, 0, 0));
			points.addWaypoint(new Waypoint(190, -36, -Math.PI * 57.0 / 180));
			
			Path path = PathGenerator.makePath(points, config, wheelBase_width, path_name);

			create(path, directory, workingDirectory, path_name, false);
		}
		
		{
			config(0.825);

			final String path_name = "LowBarOneBallAlt-Cross";

			WaypointSequence p = new WaypointSequence(10);
			p.addWaypoint(new Waypoint(0, 36 - 5, 0));
			p.addWaypoint(new Waypoint(48, 36 - 5, 0));
			p.addWaypoint(new Waypoint(90, 36 - 5, 0));
			p.addWaypoint(new Waypoint(190 + 24, -10, -Math.PI * 57.0 / 180));
			//p.addWaypoint(new Waypoint(160, -10, -Math.PI / 4));
			Path path = PathGenerator.makePath(p, config, 24, path_name);

			create(path, directory, workingDirectory, path_name, false);
			create(path, directory, workingDirectory, path_name + "-Back", true);
		}
		
		{
			config(0.68);

			final String path_name = "LowBarTwoBallAlt-Back";

			WaypointSequence points = new WaypointSequence(10);
			points.addWaypoint(new Waypoint(-12, 0, Math.PI * 20.0 / 180));
			points.addWaypoint(new Waypoint(48, 24, 0));
			points.addWaypoint(new Waypoint(86, 24, 0));
			points.addWaypoint(new Waypoint(120, 24, 0));
			points.addWaypoint(new Waypoint(190 + 24, 0, -Math.PI * 20.0 / 180));

			Path path = PathGenerator.makePath(points, config, wheelBase_width, path_name);

			create(path, directory, workingDirectory, path_name, true);
		}
		
		{
			config(0.85);

			final String path_name = "LowBarTwoBallAlt-Cross";
			
			WaypointSequence points = new WaypointSequence(10);
			points.addWaypoint(new Waypoint(-12, 0, Math.PI * 20.0 / 180));
			points.addWaypoint(new Waypoint(48, 24, 0));
			points.addWaypoint(new Waypoint(86, 24, 0));
			points.addWaypoint(new Waypoint(120, 24, 0));
			points.addWaypoint(new Waypoint(190 + 24, -17, -Math.PI * 57.0 / 180));	
		
			Path path = PathGenerator.makePath(points, config, wheelBase_width, path_name);

			create(path, directory, workingDirectory, path_name, false);
		}
		
		{
			config(0.9);

			final String path_name = "PositionFive";
			
			WaypointSequence points = new WaypointSequence(10);
			points.addWaypoint(new Waypoint(0, 0, -Math.PI * 20.0 / 180));	
			points.addWaypoint(new Waypoint(48, -15, 0));	
		
			Path path = PathGenerator.makePath(points, config, wheelBase_width, path_name);

			create(path, directory, workingDirectory, path_name + "-Forward", false);
			create(path, directory, workingDirectory, path_name + "-Back", true);
		}
	}
	
	public static void createMoatCross() {
		
		WaypointSequence points = new WaypointSequence(10);
		points.addWaypoint(new Waypoint(0, 0, 0));
		points.addWaypoint(new Waypoint(Constants.MOAT_DISTANCE, 0, 0));
		
		createDefenseCross("Moat", points, Constants.MOAT_SPEED);
	}
	
	public static void createRampartsCross() {
		
		WaypointSequence points = new WaypointSequence(10);
		points.addWaypoint(new Waypoint(0, 0, 0));
		points.addWaypoint(new Waypoint(Constants.RAMPARTS_DISTANCE, 0, 0));
		
		createDefenseCross("Ramparts", points, Constants.RAMPARTS_SPEED);
	}
	
	public static void createRoughTerrainCross() {
		
		WaypointSequence points = new WaypointSequence(10);
		points.addWaypoint(new Waypoint(0, 0, 0));
		points.addWaypoint(new Waypoint(Constants.ROUGH_TERRAIN_DISTANCE, 0, 0));
		
		createDefenseCross("RoughTerrain", points, Constants.ROUGH_TERRAIN_SPEED);
	}
	
	public static void createRockWallCross() {

		WaypointSequence points = new WaypointSequence(10);
		points.addWaypoint(new Waypoint(0, 0, 0));
		points.addWaypoint(new Waypoint(Constants.ROCK_WALL_DISTANCE, 0, 0));
		
		createDefenseCross("RockWall", points, Constants.ROCK_WALL_SPEED);
	}
	
	public static void createSallyCross() {

		WaypointSequence points = new WaypointSequence(10);
		points.addWaypoint(new Waypoint(0, 0, 0));
		points.addWaypoint(new Waypoint(Constants.SALLY_PORT_CROSS - 50, 0, 0));
		points.addWaypoint(new Waypoint(Constants.SALLY_PORT_CROSS, -50, 0));
		
		createDefenseCross("SallyPortLeft", points, Constants.SALLY_PORT_SPEED);
		

		WaypointSequence pointsB = new WaypointSequence(10);
		pointsB.addWaypoint(new Waypoint(0, 0, 0));
		pointsB.addWaypoint(new Waypoint(Constants.SALLY_PORT_CROSS - 50, 0, 0));
		pointsB.addWaypoint(new Waypoint(Constants.SALLY_PORT_CROSS, 50, 0));
		
		createDefenseCross("SallyPortRight", pointsB, Constants.SALLY_PORT_SPEED);
	}
	
	public static void createDefenseCross(String name, WaypointSequence points, double percentSpeed) {
		
		{
			config(percentSpeed);

			Path path = PathGenerator.makePath(points, config, wheelBase_width, name);

			create(path, directory, workingDirectory, name + "-Back", true);
			create(path, directory, workingDirectory, name + "-Cross", false);
		}
	}
}
