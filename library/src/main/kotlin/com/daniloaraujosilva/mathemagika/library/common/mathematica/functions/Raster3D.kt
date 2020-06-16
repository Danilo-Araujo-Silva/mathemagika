package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Raster3D
 *
 * Full name:        System`Raster3D
 *
 *                   Raster3D[{{{a  , a  , …}, …}, …}] is a three-dimensional graphics primitive that represents a cubical array of gray cells.
 *                                11   12
 *                   Raster3D[{{{{r  , g  , b  }, …}, …}, …}] represents an array of RGB color cells.
 *                                 11   11   11
 *                   Raster3D[{{{{r  , g  , b  , α  }, …}, …}, …}] represents an array of color cells with opacity α  .
 *                                 11   11   11   11                                                                ij
 *                   Raster3D[array, {{x   , y   , z   }, {x   , y   , z   }}] represents a three-dimensional graphics primitive by giving the coordinates of opposite corners.
 *                                      min   min   min     max   max   max
 *                   Raster3D[array, coordinates, {a   , a   }] represents a three-dimensional graphics primitive whose voxel values should be scaled so that a    corresponds to 0 and a    corresponds to 1.
 * Usage:                                           min   max                                                                                                  min                       max
 *
 *                   ClipRange -> None
 *                   ColorFunction -> Automatic
 *                   Method -> Automatic
 *                   PlotRange -> Automatic
 *                   PlotRangeClipPlanesStyle -> Automatic
 * Options:          VertexDataCoordinates -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Raster3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/Raster3D.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun raster3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Raster3D", arguments.toMutableList(), options)
}
