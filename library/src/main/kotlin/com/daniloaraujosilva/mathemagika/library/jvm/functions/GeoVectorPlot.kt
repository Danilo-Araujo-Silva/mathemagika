package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeoVectorPlot
 *
 * Full name:        System`GeoVectorPlot
 *
 *                   GeoVectorPlot[vecs] generates a vector plot from the field of geo vectors vecs.
 *                   GeoVectorPlot[{vecs , vecs , …}] generates a separate set of vectors for each vecs .
 * Usage:                               1      2                                                       i
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
 *                   BoundaryStyle -> None
 *                   BoxRatios -> Automatic
 *                   ClippingStyle -> None
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
 *                   GeoZoomLevel -> Automatic
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelingFunction -> Automatic
 *                   LabelStyle -> {}
 *                   LightingAngle -> None
 *                   MaxRecursion -> Automatic
 *                   Mesh -> None
 *                   MeshFunctions -> (#3 & )
 *                   MeshShading -> Automatic
 *                   MeshStyle -> Automatic
 *                   MetaInformation -> {}
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotPoints -> Automatic
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RasterSize -> Automatic
 *                   RegionBoundaryStyle -> Automatic
 *                   RegionFillingStyle -> Automatic
 *                   RegionFunction -> (True & )
 *                   RotateLabel -> True
 *                   StreamColorFunction -> None
 *                   StreamColorFunctionScaling -> True
 *                   StreamMarkers -> Automatic
 *                   StreamPoints -> None
 *                   StreamScale -> Automatic
 *                   StreamStyle -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   VectorAspectRatio -> Automatic
 *                   VectorColorFunction -> Automatic
 *                   VectorColorFunctionScaling -> True
 *                   VectorMarkers -> Automatic
 *                   VectorPoints -> Automatic
 *                   VectorRange -> Automatic
 *                   VectorScale -> None
 *                   VectorScaling -> None
 *                   VectorSizes -> Automatic
 *                   VectorStyle -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoVectorPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoVectorPlot.html
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
fun geoVectorPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoVectorPlot", arguments.toMutableList(), options)
}
