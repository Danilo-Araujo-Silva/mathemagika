package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoRegionValuePlot
 *
 * Full name:        System`GeoRegionValuePlot
 *
 *                   GeoRegionValuePlot[{reg   val , reg   val , …}] generates a plot in which the geographic regions reg  are colored according to the values val .
 *                                          1      1     2      2                                                          i                                        i
 *                   GeoRegionValuePlot[reg  val] generates a plot in which the geographic subdivisions of reg are colored according to the values EntityValue[…, val].
 * Usage:            GeoRegionValuePlot[entityclass  val] generates a plot in which the geographic regions in entityclass are colored according to the values EntityValue[…, val].
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
 *                   ClippingStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ColorRules -> Automatic
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
 *                   LabelingSize -> Automatic
 *                   LabelStyle -> Automatic
 *                   MetaInformation -> {}
 *                   Method -> Automatic
 *                   MissingStyle -> Automatic
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
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoRegionValuePlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoRegionValuePlot.html
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
fun geoRegionValuePlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoRegionValuePlot", arguments.toMutableList(), options)
}
