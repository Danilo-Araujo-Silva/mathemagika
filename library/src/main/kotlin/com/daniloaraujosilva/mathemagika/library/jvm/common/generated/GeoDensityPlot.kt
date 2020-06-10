package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GeoDensityPlot
 * 
 * Full name:        System`GeoDensityPlot
 * 
 *                   GeoDensityPlot[{loc   val , loc   val , …}] makes a geo density plot with colors at the location loc  determined by the value val .
 *                                      1      1     2      2                                                              i                            i
 * Usage:            GeoDensityPlot[locs  vals] uses a collection of locations locs with corresponding values vals.
 * 
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> 1
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   BoundaryStyle -> None
 *                   BoxRatios -> Automatic
 *                   ClippingStyle -> None
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FormatType :> TraditionalForm
 *                   Frame -> False
 *                   Frame -> True
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
 *                   GeoZoomLevel -> Automatic
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   InterpolationOrder -> Automatic
 *                   LabelStyle -> {}
 *                   LightingAngle -> None
 *                   MaxPlotPoints -> Automatic
 *                   Mesh -> None
 *                   MeshFunctions -> {#1 & , #2 & }
 *                   MeshStyle -> Automatic
 *                   MetaInformation -> {}
 *                   Method -> Automatic
 *                   OpacityFunction -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> All
 *                   PlotRange -> {Full, Full, Automatic}
 *                   PlotRangeClipping -> False
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RasterSize -> Automatic
 *                   RegionFunction -> (True & )
 *                   RotateLabel -> True
 *                   ScalingFunctions -> None
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 * Options:          VertexColors -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GeoDensityPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoDensityPlot.html
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
fun geoDensityPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoDensityPlot", arguments.toMutableList(), options)
}
