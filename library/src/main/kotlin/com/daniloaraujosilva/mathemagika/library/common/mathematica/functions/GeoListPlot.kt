package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoListPlot
 *
 * Full name:        System`GeoListPlot
 *
 *                   GeoListPlot[{loc , loc , …}] generates a map on which the locations loc  are indicated.
 *                                   1     2                                                i
 *                   GeoListPlot[{list , list , …}]  generates a map showing several lists of locations.
 * Usage:                             1      2
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FormatType :> TraditionalForm
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   GeoBackground -> Automatic
 *                   GeoCenter -> Automatic
 *                   GeoGridLines -> None
 *                   GeoGridLinesStyle -> Automatic
 *                   GeoGridRange -> All
 *                   GeoGridRangePadding -> Automatic
 *                   GeoLabels -> None
 *                   GeoModel -> Automatic
 *                   GeoProjection -> Automatic
 *                   GeoRange -> Automatic
 *                   GeoRangePadding -> Automatic
 *                   GeoResolution -> Automatic
 *                   GeoScaleBar -> None
 *                   GeoServer -> Automatic
 *                   GeoZoomLevel -> Automatic
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   Joined -> False
 *                   LabelingSize -> Automatic
 *                   LabelStyle -> Automatic
 *                   MetaInformation -> {}
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotLegends -> Automatic
 *                   PlotMarkers -> Automatic
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RasterSize -> Automatic
 *                   RotateLabel -> True
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoListPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoListPlot.html
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
fun geoListPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoListPlot", arguments.toMutableList(), options)
}
