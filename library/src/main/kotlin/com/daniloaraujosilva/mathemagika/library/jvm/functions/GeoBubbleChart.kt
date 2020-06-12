package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoBubbleChart
 *
 * Full name:        System`GeoBubbleChart
 *
 *                   GeoBubbleChart[{reg   val , reg   val , …}] makes a geo bubble chart with bubbles centered at the geographic regions reg  with sizes val .
 *                                      1      1     2      2                                                                                  i               i
 *                   GeoBubbleChart[regions  values] uses a collection of regions reg  from regions with corresponding sizes val  from values.
 *                                                                                    i                                          i
 *                   GeoBubbleChart[{data , data , …}] plots data from all the data .
 *                                       1      2                                  i
 *                   GeoBubbleChart[{…, w[data ], …}] plots data  with features defined by the symbolic wrapper w.
 * Usage:                                     i                 i
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
 *                   BubbleScale -> Area
 *                   BubbleSizes -> Automatic
 *                   ChartBaseStyle -> Automatic
 *                   ChartElementFunction -> Automatic
 *                   ChartElements -> Automatic
 *                   ChartLabels -> Automatic
 *                   ChartLegends -> None
 *                   ChartStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
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
 *                   GeoModel -> Automatic
 *                   GeoProjection -> Automatic
 *                   GeoRange -> Automatic
 *                   GeoRangePadding -> Automatic
 *                   GeoResolution -> Automatic
 *                   GeoScaleBar -> None
 *                   GeoServer -> Automatic
 *                   GeoServer -> Automatic
 *                   GeoZoomLevel -> Automatic
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelingFunction -> Automatic
 *                   LabelingSize -> Automatic
 *                   LabelStyle -> {}
 *                   MetaInformation -> {}
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme -> Automatic
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
 *                   local: paclet:ref/GeoBubbleChart
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoBubbleChart.html
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
fun geoBubbleChart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoBubbleChart", arguments.toMutableList(), options)
}
