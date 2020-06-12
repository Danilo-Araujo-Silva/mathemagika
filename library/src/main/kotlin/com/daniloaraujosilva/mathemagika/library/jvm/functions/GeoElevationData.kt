package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoElevationData
 *
 * Full name:        System`GeoElevationData
 *
 *                   GeoElevationData[] gives the elevation above sea level at $GeoLocation.
 *                   GeoElevationData[loc] gives the elevation at the geographic location loc.
 *                   GeoElevationData[{loc , loc }] gives an array of elevation values within the bounding box given by {loc , loc }.
 *                                        1     2                                                                           1     2
 *                   GeoElevationData[GeoPosition[{{lat , lon }, {lat , lon }, …}]] gives the list of elevations at the positions {lat , lon }.
 *                                                     1     1       2     2                                                          i     i
 *                   GeoElevationData[loc, etype] gives the elevation of type etype for the location loc.
 * Usage:            GeoElevationData[loc, etype, format] gives the elevation in the specified format.
 *
 *                   AspectRatio -> Automatic
 *                   Background -> 0
 *                   GeoArraySize -> Automatic
 *                   GeoCenter -> Automatic
 *                   GeoGridRange -> All
 *                   GeoGridRangePadding -> Automatic
 *                   GeoModel -> Automatic
 *                   GeoProjection -> Equirectangular
 *                   GeoRange -> Automatic
 *                   GeoRangePadding -> Automatic
 *                   GeoResolution -> Automatic
 *                   GeoServer -> Automatic
 *                   GeoZoomLevel -> Automatic
 *                   Method -> Automatic
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoElevationData
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoElevationData.html
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
fun geoElevationData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoElevationData", arguments.toMutableList(), options)
}
