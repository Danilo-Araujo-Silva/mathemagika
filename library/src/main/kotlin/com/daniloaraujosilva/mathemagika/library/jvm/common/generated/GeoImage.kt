package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GeoImage
 * 
 * Full name:        System`GeoImage
 * 
 *                   GeoImage[reg] gives a satellite image of the geo region reg.
 * Usage:            GeoImage[reg, mapstyle] gives an image of the geo region reg with style mapstyle.
 * 
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   ColorSpace -> Automatic
 *                   GeoCenter -> Automatic
 *                   GeoGridRange -> All
 *                   GeoGridRangePadding -> Automatic
 *                   GeoModel -> Automatic
 *                   GeoProjection -> Mercator
 *                   GeoRange -> Automatic
 *                   GeoRangePadding -> Automatic
 *                   GeoResolution -> Automatic
 *                   GeoServer -> Automatic
 *                   GeoZoomLevel -> Automatic
 *                   ImageResolution -> Automatic
 *                   ImageSize -> Automatic
 *                   Interleaving -> Automatic
 *                   Magnification -> Automatic
 *                   MetaInformation -> {}
 *                   Method -> Automatic
 * Options:          RasterSize -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GeoImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoImage.html
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
fun geoImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoImage", arguments.toMutableList(), options)
}
